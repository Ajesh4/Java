public class CPU {
    private double price;

    public CPU(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public class Processor {
        private int numOfCores;
        private String manufacturer;

        public Processor(int numOfCores, String manufacturer) {
            this.numOfCores = numOfCores;
            this.manufacturer = manufacturer;
        }

        public int getNumOfCores() {
            return numOfCores;
        }

        public void setNumOfCores(int numOfCores) {
            this.numOfCores = numOfCores;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }
    }

    public static class RAM {
        private int memory;
        private String manufacturer;

        public RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        public int getMemory() {
            return memory;
        }

        public void setMemory(int memory) {
            this.memory = memory;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }
    }

    public static void main(String[] args) {
        CPU cpu = new CPU(1000.0);
        CPU.Processor processor = cpu.new Processor(4, "Intel");
        CPU.RAM ram = new CPU.RAM(8, "Kingston");

        System.out.println("CPU price: $" + cpu.getPrice());
        System.out.println("Processor: " + processor.getNumOfCores() + " cores, " + processor.getManufacturer());
        System.out.println("RAM: " + ram.getMemory() + " GB, " + ram.getManufacturer());
    }
}

