package com.skm.algo.linkedlist;

/**
 * Created by saroj on 7/22/2019.
 */
public class AddLinkedListApplication {
    public static void main(String arg[]){
        SingleListNode singleListNode = new SingleListNode(2);
        singleListNode.setNextNode(new SingleListNode(3));
        singleListNode.getNextNode().setNextNode(new SingleListNode(4));
        /*singleListNode.getNextNode().getNextNode().setNextNode(new SingleListNode(13));
        singleListNode.getNextNode().getNextNode().getNextNode().setNextNode(new SingleListNode(14));
        singleListNode.getNextNode().getNextNode().getNextNode().getNextNode().setNextNode(new SingleListNode(15));*/

        SingleListNode secondList = new SingleListNode(1);
        secondList.setNextNode(new SingleListNode(7));
        secondList.getNextNode().setNextNode(new SingleListNode(9));

        System.out.println("FirstLinkedList : "+singleListNode);
        System.out.println("SecondLinkedList : "+secondList);

        SingleListNode reultList = addRecurssive(singleListNode,secondList);
        System.out.println("ResultLinkedList : "+reultList);
    }
    public static SingleListNode addLinkedList(SingleListNode singleListNode, SingleListNode secondList){
        SingleListNode resultList = null;
        SingleListNode head = null;
        int carry = 0;
        while(singleListNode != null && secondList != null){
            int sum = 0;
            //calculate sum...
            sum = carry+singleListNode.getData() + secondList.getData();
            if(sum > 9 && singleListNode.getNextNode() != null){
                carry=1;
                sum = sum%10;
            }else carry=0;

            if(resultList == null){
                resultList = new SingleListNode(sum);
                head=resultList;
            }else{
                resultList.setNextNode(new SingleListNode(sum));
                resultList = resultList.getNextNode();
            }

            singleListNode = singleListNode.getNextNode();
            secondList = secondList.getNextNode();
        }
        return head;
    }
    static int carry = 0;
    static SingleListNode newNode = null;
    /*public static SingleListNode addRecurssively(SingleListNode firstNode, SingleListNode secondNod){
            if(firstNode==null && secondNod==null){
                return null;
            }
        addRecurssively(firstNode.getNextNode(), secondNod.getNextNode());
            int a = firstNode.getData() + secondNod.getData() + carry;
            carry=0;
            //System.out.printlxn(a);
            if(a>=10){
                carry =1;
                a = a%10;
            }
            SingleListNode n = new SingleListNode(a);
            if(newNode==null){
                newNode =n;
            }else{
                n.setNextNode(newNode);
                newNode = n;
            }
            return newNode;
    }*/
    public static SingleListNode addRecurssive(SingleListNode firstNode, SingleListNode secondNode){
        if(firstNode == null && secondNode == null){
            return  null;
        }
        addRecurssive(firstNode.getNextNode(),secondNode.getNextNode());
        int result = firstNode.getData()+secondNode.getData()+carry;
        carry = 0; //reset the carry...
        if(result>=10){
            carry = 1;
            result = result%10;
        }

        SingleListNode node = new SingleListNode(result);
        if(newNode != null){
            node.setNextNode(newNode);
        }
        newNode = node;
        return node;
    }
}
