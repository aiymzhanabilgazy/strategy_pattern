package strategy;

import strategy.ConcreteStrategy.Bzip2Compression;
import strategy.ConcreteStrategy.GzipCompression;
import strategy.ConcreteStrategy.XzCompression;
import strategy.Context.FileCompressor;

public class Main {
    public static void main(String[] args) {

        FileCompressor compressor = new FileCompressor(new Bzip2Compression());
        compressor.compressFile("notes.txt");

        System.out.println("\nSwitching to GZIP strategy");
        compressor.setStrategy(new GzipCompression());
        compressor.compressFile("word.docx");

        System.out.println("\nSwitching to XZ strategy");
        compressor.setStrategy(new XzCompression());
        compressor.compressFile("archive.tar");
    }
}
