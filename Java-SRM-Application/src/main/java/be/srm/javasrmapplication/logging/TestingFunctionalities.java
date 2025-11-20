package be.srm.javasrmapplication.logging;


import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.software.os.OperatingSystem;

public class TestingFunctionalities {

        private static SystemInfo si = new SystemInfo();
        private static CentralProcessor cpu = si.getHardware().getProcessor();



        public static void main(String[] args){
            OperatingSystem OS = si.getOperatingSystem();
            System.out.println(OS);
            System.out.println(si.getOperatingSystem().getFileSystem());
            System.out.println(si.getOperatingSystem().getCurrentProcess());
            System.out.println(si.getHardware().getGraphicsCards());
            System.out.println(si.getHardware().getMemory());

            System.out.println(Math.round((cpu.getSystemCpuLoad(1000) * 100)) + "%");


        }

}


