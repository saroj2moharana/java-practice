package com.skm.machineround.splitwise;

import com.skm.machineround.splitwise.constant.ExpenseType;
import com.skm.machineround.splitwise.dao.ExpenseManager;
import com.skm.machineround.splitwise.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author Saroj on 16/05/22
 * Expense in the format: EXPENSE <user-id-of-person-who-paid> <amount> <no-of-users> <space-separated-list-of-users> <EQUAL/EXACT/PERCENT> <space-separated-values-in-case-of-non-equal>
 * Show balances for all: SHOW
 * Show balances for a single user: SHOW <user-id>
 **/
public class SplitWiseDemo {
    public static void main(String[] arg){
        ExpenseManager expenseManager = new ExpenseManager();
        String phone = "9876543210";
        expenseManager.addUser(new User("u1", "User1", "gaurav@workat.tech", phone));
        expenseManager.addUser(new User("u2", "User2", "sagar@workat.tech", phone));
        expenseManager.addUser(new User("u3", "User3", "hi@workat.tech", phone));
        expenseManager.addUser(new User("u4", "User4", "mock-interviews@workat.tech", phone));

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter Command:");
            String command = scanner.nextLine();
            String[] commands = command.split(" ");
            String commandType = commands[0];
            System.out.println("CommandType:"+commandType);
            switch (commandType) {
                case "SHOW":
                    if (commands.length == 1) {
                        expenseManager.showBalances();
                    } else {
                        expenseManager.showBalance(commands[1]);
                    }
                    break;
                case "EXPENSE":
                    String paidBy = commands[1];
                    Double amount = Double.parseDouble(commands[2]);
                    int noOfUsers = Integer.parseInt(commands[3]);
                    String expenseType = commands[4 + noOfUsers];
                    List<Split> splits = new ArrayList<>();
                    switch (expenseType) {
                        case "EQUAL":
                            for (int i = 0; i < noOfUsers; i++) {
                                splits.add(new EqualSplit(expenseManager.userMap.get(commands[4 + i])));
                            }
                            expenseManager.addExpense(ExpenseType.EQUAL, amount, paidBy, splits, null);
                            break;
                        case "EXACT":
                            for (int i = 0; i < noOfUsers; i++) {
                                splits.add(new ExactSplit(expenseManager.userMap.get(commands[4 + i]), Double.parseDouble(commands[5 + noOfUsers + i])));
                            }
                            expenseManager.addExpense(ExpenseType.EXACT, amount, paidBy, splits, null);
                            break;
                        case "PERCENT":
                            for (int i = 0; i < noOfUsers; i++) {
                                splits.add(new PercentSplit(expenseManager.userMap.get(commands[4 + i]), Double.parseDouble(commands[5 + noOfUsers + i])));
                            }
                            expenseManager.addExpense(ExpenseType.PERCENT, amount, paidBy, splits, null);
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }
            System.out.println("Continue?");
        }while (scanner.nextLine().equals("y"));
    }
}
