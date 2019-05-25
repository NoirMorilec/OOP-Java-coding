package FirstPackage1;

public class MyStaticClass{

    public static void ShowArr(int N, float []arr, boolean flag)
    {
        for (int i = 0; i<N;++i)
        {
            if (flag)
            {
                System.out.print(arr[i]+" ");
            }
            else
            {
                System.out.print((int)arr[i]+" ");
            }
        }
        System.out.println();

    }

    public static void FirstFunc(int N, float[] arr)
    {
        System.out.println();
        int sum = 0;
        int k = 0;
        for (int i = 0; i<N;i++)
        {
            sum += arr[i];
        }
        System.out.println("(for) Сумма чисел массива равна: "+(int)sum);
        sum = 0;
        while (k<N)
        {
            sum += arr[k];
            k++;
        }
        System.out.println("(while) Сумма чисел массива равна: "+(int)sum);
        k = 0;
        sum = 0;
        do
        {
            sum += arr[k];
            k++;
        }while(k<N);
        System.out.println("(do while) Сумма чисел массива равна: "+(int)sum);
    }

    public static void SecondFunc(String[] args)
    {
        for (int i = 0; i<args.length;i++)
        {
            System.out.print(args[i] + " ");
        }
    }

    public static void ThirdFunc()
    {
        int size = 10;
        float[] arr = new float[size];
        float del = 1;
        for (int i = 0; i<size;i++)
        {
            arr[i] = 1/del;
            del++;
        }
        ShowArr(size,arr,true);
    }

    public static void FourthFunc(int N,float arr[])
    {
        for (int i = 0; i<N; i++)
        {
            arr[i] = (int)(Math.random()*10);
        }
        ShowArr(N,arr,false);
        for (int i = 0; i < arr.length; i++)
        {
            int min = (int)arr[i];
            int min_i = i;
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[j] < min)
                {
                    min = (int)arr[j];
                    min_i = j;
                }
            }
            if (i != min_i)
            {
                int tmp = (int)arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        ShowArr(N,arr,false);
    }

    public static void FifthFunc(int n)
    {
        int factor=1,count;
        for(count = 1;count<=n;count++)
        {
            factor*=count;
        }
        System.out.println("Факториал числа "+n+" равен "+factor);
    }

}
