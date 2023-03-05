package lesson6_hw;

public class Notebook {
    private String brand;
    private String model;
    private double dispSize;
    private String resolution;
    private String cpuManu;
    private int cpuFreq;
    private int ram;
    private int driveSize;
    private String system;
    private String color;
    private int price;


    @Override
    public String toString() {
        return "\nНоутбук " + brand +" "+ model + ", Дисплей "+dispSize +"\" "+ resolution
                + ", CPU " + cpuManu + ", Частота " + cpuFreq + " МГц, ОЗУ " + ram + ", накопитель " + driveSize
                + "Гб, Система:" + system + ", Цвет " + color + ", Цена " + price + "р.\n";
    }


    public Notebook(String brand, String model, double dispSize, String resolution, String cpuManu, int cpuFreq,
            int ram, int driveSize, String system, String color, int price) {
        this.brand = brand;
        this.model = model;
        this.dispSize = dispSize;
        this.resolution = resolution.replaceAll(" ", "");
        this.cpuManu = cpuManu;
        this.cpuFreq = cpuFreq;
        this.ram = ram;
        this.driveSize = driveSize;
        this.system = system;
        this.color = color;
        this.price = price;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        long temp;
        temp = Double.doubleToLongBits(dispSize);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((resolution == null) ? 0 : resolution.hashCode());
        result = prime * result + ((cpuManu == null) ? 0 : cpuManu.hashCode());
        result = prime * result + cpuFreq;
        result = prime * result + ram;
        result = prime * result + driveSize;
        result = prime * result + ((system == null) ? 0 : system.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Notebook other = (Notebook) obj;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (Double.doubleToLongBits(dispSize) != Double.doubleToLongBits(other.dispSize))
            return false;
        if (resolution == null) {
            if (other.resolution != null)
                return false;
        } else if (!resolution.equals(other.resolution))
            return false;
        if (cpuManu == null) {
            if (other.cpuManu != null)
                return false;
        } else if (!cpuManu.equals(other.cpuManu))
            return false;
        if (cpuFreq != other.cpuFreq)
            return false;
        if (ram != other.ram)
            return false;
        if (driveSize != other.driveSize)
            return false;
        if (system == null) {
            if (other.system != null)
                return false;
        } else if (!system.equals(other.system))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
    

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getDispSize() {
        return dispSize;
    }

    public String getResolution() {
        return resolution;
    }

    public String getCpuManu() {
        return cpuManu;
    }

    public int getCpuFreq() {
        return cpuFreq;
    }

    public int getram() {
        return ram;
    }

    public int getDriveSize() {
        return driveSize;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
