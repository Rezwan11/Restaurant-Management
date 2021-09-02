
package Restaurant;


public class calculation {
    
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h;
        int i;
        int j;
        int k;
        int l;
        int m;
        int n;
        int o;
        int p;
        int q;
        int r;
        double xyz1;
        
        
        calculation(int a1,int b1,int c1,int d1,int e1,int f1,
                int g1,int h1,int i1,int j1,int k1,int l1,int m1,
                int n1,int o1,int p1,int q1,int r1)
        {
            
            a=a1;
            b=b1;
            c=c1;
            d=d1;
            f=f1;
            g=g1;
            h=h1;
            i=i1;
            j=j1;
            k=k1;
            l=l1;
            m=m1;
            n=n1;
            o=o1;
            p=p1;
            q=q1;
            r=r1;

        }
        double bill(){
            return a*180+b*160+c*140+d*120+e*80+f*85
             +g*90+h*50+i*35+j*35+k*35+l*200+m
             *150+n*120+o*150+p*120+q*150+r*220;
            
        }
        double tax(){
            return .15*bill();
        }
        
        double sub_total(){
            return bill()+tax();
        }
        
        double change(){
            
            
            return sub_total()-xyz1;
        }
            

    
}
