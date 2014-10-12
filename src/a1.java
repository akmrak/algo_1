
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class a1 {
    public static void mergeSort(int[] arrayList,int[] C,int p1, int p2)
    {
        if(p2>p1)
        {
            mergeSort(arrayList,C, p1, (p1 + p2) / 2);
            int t=0;
            while(t<10)
            {
                System.out.println(arrayList[t]+" "+ C[t]);

                t++;

            }
            System.out.println("Hello");
            mergeSort(arrayList,C, (p1 + p2) / 2  +  1, p2);
            t=0;
            while(t<10)
            {
                System.out.println(arrayList[t]+" "+ C[t]);

                t++;

            }
            System.out.println("Hello");
            merge(arrayList,C, p1, (p1 + p2) / 2, p2);
            t=0;
            while(t<10)
            {
                System.out.println(arrayList[t]+" "+ C[t]);

                t++;

            }
            System.out.println("Hello");
        }



    }
    public static void merge(int[] A,int[] C, int l , int m , int r )
    {
        int k=l;
        int i=l,j=m+1;
        while(i<=m&&j<=r)
        {
            if(A[i]<A[j])
            {
                C[k]=A[i];
                k++;
                i++;

            }
            else
            {

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
        int[] arrayList1={32,12,4,6,23,1,4,6,42,24};
        int[] C1=new int[arrayList1.length];
        mergeSort(arrayList1,C1,0,arrayList1.length-1);
        int[] arrayList2={12,23,34,45,48,2,9,24,36,47};
        //merge(arrayList2,C1,0,4,9);
        int t=0;
        while(t<10)
        {
            System.out.println(arrayList1[t]);
            t++;

        }

    }
}