
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class a1 {
    public static long mergeSort(int[] arrayList,int[] C,int p1, int p2)
    {
        long n=0;
        if(p2==p1)
            return 0;
        else if(p2>p1)
        {
            n+=mergeSort(arrayList,C, p1, (p1 + p2) / 2);
            //System.out.println(n);
            n+=mergeSort(arrayList,C, (p1 + p2) / 2  +  1, p2);
            //System.out.println(n);
            n+=merge(arrayList,C, p1, (p1 + p2) / 2, p2);
            //System.out.println(n);
            //System.out.println("Hello");
            return n;
        }

        return n;

    }
    public static long merge(int[] A,int[] C, int l , int m , int r )
    {
        long n=0;
        int k=l;
        int i=l,j=m+1;
        while(i<=m&&j<=r)
        {
            if(A[i]<=A[j])
            {
                C[k]=A[i];
                k++;
                i++;

            }
            else
            {

                n+=m-i+1;
                C[k]=A[j];
                k++;
                j++;

            }


        }
        if(i<=m)
        {
            while(i<=m)
            {
                C[k] = A[i];
                k++;
                i++;

            }

        }
        else
        {
            while(j<=r)
            {
                C[k]=A[j];
                k++;
                j++;

            }
        }
        i=l;
        while(i<=r)
        {
            A[i]=C[i];
            i++;

        }
        return n;

    }
    public static void main(String[] args) {

        BufferedReader br = null;
        int[] arrayList=new int[100000];
        int[] C=new int[100000];
        int newNum;
        int i=0;
        try {

            String sCurrentLine;

            br = new BufferedReader(new FileReader("/home/maddoxx/hobby/algo_1/pro_1/IntegerArray.txt"));

            while ((sCurrentLine = br.readLine()) != null) {
                newNum=Integer.parseInt(sCurrentLine);
                //System.out.println(newNum);
                arrayList[i]=newNum;
                i++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        int[] arrayList1= { 4, 80, 70, 23, 9, 60, 68, 27, 66, 78, 12, 40, 52, 53, 44, 8, 49, 28, 18, 46, 21, 39, 51, 7, 87, 99, 69, 62, 84, 6, 79, 67, 14, 98, 83, 0, 96, 5, 82, 10, 26, 48, 3, 2, 15, 92, 11, 55, 63, 97, 43, 45, 81, 42, 95, 20, 25, 74, 24, 72, 91, 35, 86, 19, 75, 58, 71, 47, 76, 59, 64, 93, 17, 50, 56, 94, 90, 89, 32, 37, 34, 65, 1, 73, 41, 36, 57, 77, 30, 22, 13, 29, 38, 16, 88, 61, 31, 85, 33, 54 };
        int[] C1=new int[arrayList1.length];
        System.out.println(mergeSort(arrayList,C,0,arrayList.length-1));
        int[] arrayList2={12,23,34,45,48,2,9,24,36,47};
        //merge(arrayList2,C1,0,4,9);
        int t=0;
        //while(t<arrayList1.length)
        //{
        //    System.out.println(arrayList1[t]);
        //    t++;

        //}

    }
}