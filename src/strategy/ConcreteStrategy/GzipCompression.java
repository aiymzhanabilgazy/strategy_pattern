package strategy.ConcreteStrategy;

import strategy.StrategyInterface.CompressionStrategy;

public class GzipCompression implements CompressionStrategy {
    private String compressionType;
    private String description;
    private String message;

    public GzipCompression() {
        this.compressionType = "gzip";
        this.description = "Gzip offers fast compression and decompression speeds with moderate compression ratios.";
        this.message = "File compressed successfully!";
    }
    public String getCompressionType() {
        return compressionType;
    }
    public void setCompressionType(String compressionType) {
        this.compressionType = compressionType;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public void compress(String filePath){
        System.out.println("Compressing file " + filePath);
        System.out.println("Compressing file with: " + getCompressionType());
        System.out.println("Description: " + getDescription());
        System.out.println(getMessage());
    }
}
