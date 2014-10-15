
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class a1 {
    public static int mergeSort(int[] arrayList,int[] C,int p1, int p2)
    {
        int n=0;
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
    public static int merge(int[] A,int[] C, int l , int m , int r )
    {
        int n=0;
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
        int[] arrayList1={1,2 ,3 ,4 ,5 ,7, 6 ,8, 9,8};
        int[] C1=new int[arrayList1.length];
        System.out.println(mergeSort(arrayList1,C1,0,arrayList1.length-1));
        int[] arrayList2={12,23,34,45,48,2,9,24,36,47};
        //merge(arrayList2,C1,0,4,9);
        int t=0;
        while(t<arrayList1.length)
        {
            System.out.println(arrayList1[t]);
            t++;

        }

    }
}