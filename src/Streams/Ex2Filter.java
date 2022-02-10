package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2Filter {
    public static void main(String[] args) {
        Cpu cpu1 = new Cpu("Intel", 4,6.33);
        Cpu cpu2 = new Cpu("AMD", 4,6.27);
        Cpu cpu3 = new Cpu("Intel", 8,8.21);
        Cpu cpu4 = new Cpu("AMD", 8,9.12);
        Cpu cpu5 = new Cpu("Intel", 2,4.96);
        List<Cpu> cpuList = new ArrayList<>();
        cpuList.add(cpu1);
        cpuList.add(cpu2);
        cpuList.add(cpu3);
        cpuList.add(cpu4);
        cpuList.add(cpu5);

        System.out.println(cpuList);

        List<Cpu> secGen = cpuList.stream().filter(el ->
            el.amountOfCore > 3 && el.amountOfCore < 8
        ).collect(Collectors.toList());

        System.out.println(secGen);

    }
}

class Cpu{
    String name;

    int amountOfCore;
    double avgPerformance;

    Cpu(String name,int amountOfCore , double avgPerformance){
        this.name = name;
        this.amountOfCore = amountOfCore;
        this.avgPerformance = avgPerformance;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "name= \" " + name  +
                " I-" + amountOfCore +
                " \", avgPerformance=" + avgPerformance +
                '}';
    }
}