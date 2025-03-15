package com.codewarrior.code1;

public class PencilEraser {

    public static int Factorial(int n){
        if ((n == 0 ) && (n == 1)){
            return 1;
        }
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }

        return fact;
    }
    public static int Posibility(int N, int M, int P, int E){
        int res;

        int N_fact = Factorial(N);
        int M_fact = Factorial(M);
        int P_fact = Factorial(P);
        int E_fact = Factorial(E);
        int N_P_fact = Factorial(N-P);
        int M_E_fact = Factorial(M-E);

        res = (N_fact / (P_fact * N_P_fact)) * (M_fact / (E_fact * M_E_fact));
        return res;
    }
    public static void main(String[] args) {

        int N = 5;
        int M = 3;
        int P = 5;
        int E = 3;

        int answer = Posibility(N, M , P, E);

        System.out.println(answer);

    }
}
