package com.skm.algo.inter;

import java.io.File;

/**
 * @author saroj on 15/11/23
 *
 * File type .json/.kml/.shp
 * final output .geojson
 *
 */
public class Test {
    public static void main(String[] args) {
        PolyGonProcess polyGonProcess = new PolyGonProcess();
        polyGonProcess.processFile("sample.json");
    }
}

class PolyGonProcess{
    public void processFile(String fileName){
        FileParser fileParser = null;
        if(fileName.endsWith(".json")) fileParser = new GeoJsonFileParser();
        else if(fileName.endsWith(".kml")) fileParser = new KMLFileParser();
        else if(fileName.endsWith(".shp")) fileParser = new ShpFileParser();
        else System.out.println("File is not supported");
        String output = fileParser.parseFile(fileName);
        System.out.println(output);
    }
}

interface FileParser{
    String parseFile(String fileName);
}

class GeoJsonFileParser implements FileParser{
    @Override
    public String parseFile(String fileName){
        //implementation...
        return fileName+".geojson";
    }
}

class KMLFileParser implements FileParser{
    @Override
    public String parseFile(String fileName){
        //implementation...
        return fileName+".kml";
    }
}

class ShpFileParser implements FileParser{
    @Override
    public String parseFile(String fileName){
        //implementation...
        return fileName+".shp";
    }
}


