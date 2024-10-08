package Stack;

import java.util.Stack;

public class Stack_Stock_Span {

    static void Calculate_Stock_SpanDP(int A[],int n,int ans[])
    {
        ans[0] = 1;

        for(int i=0;i<n;i++)
        {
            int counter = 1;
            while((i-counter)>=0 && A[i]>=A[i-counter])
            {
                counter = counter + ans[i-counter];
            }
            ans[i] = counter;
        }
    }

    static void Calculate_Stock_Span(int price[], int n, int S[])
    {

        Stack< Integer > st = new Stack < > ();
        st.push(0);
        S[0] = 1;
        for (int i = 1; i < n; i++)
        {
            while (!st.empty() && price[st.peek()] <= price[i])
                st.pop();

            S[i] = (st.empty()) ? (i + 1) : (i - st.peek());
            st.push(i);
        }

    }

        static void print_Stock_Span(int array[], int length)
    {
        for(int i=0;i<length;i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("\n---Stack Stock Span---\n\n\n");
        int arr[] = {10, 4, 5, 90, 120, 80, 50};
        int n = arr.length;
        int Span[] = new int[n];

        int arr1[] = {100,80,60,70,65,75,85};
        int n1 = arr1.length;
        int Span1[] = new int[n1];
        Calculate_Stock_Span(arr,n,Span);
        Calculate_Stock_SpanDP(arr1,n1,Span1);

        System.out.print("\n---Stack Stock Span using Stack--- = ");
        print_Stock_Span(Span,n);
        System.out.print("\n---Stack Stock Span using DP--- = ");
        print_Stock_Span(Span1,n1);


    }
}
