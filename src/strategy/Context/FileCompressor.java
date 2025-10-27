package strategy.Context;

import strategy.StrategyInterface.CompressionStrategy;

public class FileCompressor {
    private CompressionStrategy strategy;
    public FileCompressor(CompressionStrategy strategy) {
        this.strategy = strategy;
    }
    public void setStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }
    public void compressFile(String filePath) {
        if (strategy == null) {
            System.out.println("No compression strategy founded");
            return;
        }
        strategy.compress(filePath);
    }
}
