Example AP1 = 1+2+....+100
S = 1+2+3+....+100
S = 100+99+98+....+1
So Sum = 101 that is summed 100 times
2S = 101*100 where n=100
S = 101*100/2
Hence Sum = n*(n+1)/2

Example AP2 = 1+3+5+....+99
S = n/2(2a+(n-1)d)
Where a=1, d=2(common difference), n=50
S = 50/2(2*1+(50-1)*2)
S = 25(2+98)
S = 25*100
S = 2500
S = 1+3+5+....+99
S = 99+97+95+....+1
How this formula is derived?
S = a+(a+d)+(a+2d)+....+(a+(n-1)d)
S = (a+(n-1)d)+(a+(n-2)d)+....+(a+d)+a
2S = (2a+(n-1)d)+(2a+(n-1)d)+....+(2a+(n-1)d)
2S = n(2a+(n-1)d)
S = n/2(2a+(n-1)d)
Where a=1, d=2(common difference), n=50

Example GP1 = 2+4+8+16+32(multiplying by 2)
S = a(r^n-1)/(r-1)
Where a=2, r=2(common ratio), n=6
S = 2(2^5-1)/(2-1)
S = 2(32-1)/1
S = 2*31
S = 62
How this formula is derived?
S = a+ar+ar^2+....+ar^(n-1)
S = ar^(n-1)+ar^(n-2)+....+ar^2+ar+a
rS = ar+ar^2+....+ar^n
rS = ar(1+r+r^2+....+r^(n-1))
rS = ar(r^n-1)/(r-1)
S = a(r^n-1)/(r-1)
Where a=2, r=2(common ratio), n=6

public class SumOfFirstNAP {
    //Sum of first n natural numbers
    public static int sumOfFirstNAP(int n)
    {
        return n*(n+1)/2;
    }
}
