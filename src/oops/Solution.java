package oops;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {
int price;
int type;
Result(int type,int price){
    this.type=type;
    this.price=price;
}
    /*
     * Complete the 'getMaximumAmount' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY quantity
     *  2. INTEGER m
     */

    public static long getMaximumAmount(List<Integer> quantity, int m) {
    // Write your code here
PriorityQueue<Result> maxHeap=new PriorityQueue<>((a,b)-> Integer.compare(b.price,a.price));
for (int i=0; i<quantity.size();i++){
    if(quantity.get(i)>0){
        maxHeap.offer(new Result(i,quantity.get(i)));
    }
}
long totalRevenue=0;
while(m>0&& !maxHeap.isEmpty()){
    Result currentResult=maxHeap.poll();
    int price=currentResult.price;
    int count=Math.min(m,price);
    totalRevenue +=(long)count*price;
    m-=count;
    if(price-count>0){
        maxHeap.offer(new Result(currentResult.type, price-count));
    }
}
return totalRevenue;
    }
    public static void main(String[]arg){
        List<Integer>quantity=Arrays.asList(4,3,2);
        int m=5;
        long maxRevenue=maxRevenue(quantity,m);
        System.out.println("Maximum revenue: "+maxRevenue);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int quantityCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> quantity = IntStream.range(0, quantityCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        long result = Result.getMaximumAmount(quantity, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}