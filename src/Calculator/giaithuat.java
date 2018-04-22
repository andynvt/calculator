/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;


public class giaithuat {
    
    public double GiaiThua(double n){
        double ketqua = 1;
        int i;
        for( i=1; i <= n ; i++){
            ketqua = ketqua*i;
        }
        return ketqua;
    }
    

    
    public double Cong(double a, double b){
        return a+b;
    }
    
    public double Tru(double a, double b){
        return a-b;
     }
    
    public String Nhan(double a, double b){
        if( a < 0 && b < 0)
            return "+"+a*b;
        else
            return ""+(a*b);
     }
    
    public String Chia(double a, double b){
        if( a < 0 && b < 0)
            return "+"+a/b;
        else
            return ""+(a/b);
     }
    
    public double Luythua(double a, double b){
        return Math.pow(a, b);
    }
    
    public double Binhphuong(double a){
        return a*a;
     }
    
    public double Lapphuong(double a){
        return a*a*a;
     }
    
    public double Canbac2(double a){
        return Math.sqrt(a);
    }
    
    public double Canbac3(double a){
        return Math.cbrt(a);
    }
    
    public double COS(double a, int radian){
        if(radian == 1){
            return Math.cos(a);
        }
        else
        {
            if(a == 90){
                return 0;}
            else{
                return Math.cos(Math.toRadians(a));
            }
        }
    }
    
    public double SIN(double a, int radian){
        if(radian == 1){
            return Math.sin(a);
        }
        else
        {
            return Math.sin(Math.toRadians(a));
        }
    }
    
    public double TAN(double a, int radian){
        if(radian == 1){
            return Math.tan(a);
        }
        else
        {
            return Math.tan(Math.toRadians(a));
        }
    }

    
    public double ln(double a){
        return Math.log(a);
    }
    
    public double log(double a){
        return Math.log10(a);
    }
    
    // doi thap luc phan sang nhi phan
    public String HexToBin(String n) {
        String ketqua = "";
        String []a = {"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1111"};
        for(int i = 0 ; i < n.length() ; i++){
            switch (n.charAt(i)){
                case '0' : ketqua += a[0];
                            break;
                case '1' : ketqua += a[1];
                            break;
                case '2' : ketqua += a[2];
                            break;
                case '3' : ketqua += a[3];
                            break;
                case '4' : ketqua += a[4];
                            break;
                case '5' : ketqua += a[5];
                            break;
                case '6' : ketqua += a[6];
                            break;
                case '7' : ketqua += a[7];
                            break;
                case '8' : ketqua += a[8];
                            break;
                case '9' : ketqua += a[9];
                            break;
                case 'a' : ketqua += a[10];
                            break;
                case 'b' : ketqua += a[11];
                            break;
                case 'c' : ketqua += a[12];
                            break;
                case 'd' : ketqua += a[13];
                            break;
                case 'e' : ketqua += a[14];
                            break;
                case 'f' : ketqua += a[15];
                            break;
                case 'A' : ketqua += a[10];
                            break;
                case 'B' : ketqua += a[11];
                            break;
                case 'C' : ketqua += a[12];
                            break;
                case 'D' : ketqua += a[13];
                            break;
                case 'E' : ketqua += a[14];
                            break;
                case 'F' : ketqua += a[15];
                            break;
            }
        }
        return ketqua;
    }
    
    public int BinToDec(String n){
       String temp = n;
       int ketqua = 0;
       for(int i = temp.length(); i > 0; i--){
           //System.out.print(i);
           if(temp.charAt(i-1) == '1'){
                ketqua += Math.pow(2, temp.length() - i);
                //System.out.print("2^" + i );
           }
       }
       return ketqua;
    }
    
    public int HexToDec(String n){
        return BinToDec(HexToBin(n));
    }
    
    public String BinToHex(String giatri){
        return Integer.toHexString(BinToDec(giatri));
    }
    
    
    public String Dec(int pheptinh, String giatri){
        if(pheptinh == 0){
            return giatri;
        }
        else if( pheptinh == 3){
            return BinToDec(giatri)+"";
        }
        else if( pheptinh == 4){
           return HexToDec(giatri)+"";
        }
        return "";
    }
    
        public String Bin(int pheptinh,String giatri){
        if(pheptinh == 0){
            return Integer.toBinaryString(Integer.parseInt(giatri));
        }
        else if(pheptinh == 3){
            return giatri;
        }
        else if(pheptinh == 4){
            return HexToBin(giatri);
        }
        return "";
    }
    
    public String Hex(int pheptinh, String giatri){
        if(pheptinh == 0){
            return Integer.toHexString(Integer.parseInt(giatri));
        }
        else if(pheptinh == 3){
            return BinToHex(giatri);
        }
        else if(pheptinh == 4){
            return giatri;
        }
        return "";
    }
    
    public String PTB2(double a , double b, double c){
        double x1 = 0, x2 = 0;
        double delta = b*b - 4*a*c;
        if (delta < 0){
            return "Math Error";
        }
        else if (delta == 0){
            x1 = -b/(2*a);
            x2 = x1;
        }
        else if(delta > 0){
            x1 = (-b+Math.sqrt(delta))/(2*a);
            x2 = (-b-Math.sqrt(delta))/(2*a);
        }
        return "x1 = "+ x1 + ", x2 =" + x2 +"";
    }
    
    public String PTB1haian(double a, double b, double c, double m, double n, double k){
        double x = 0, y = 0;
        double d = 0, dx = 0, dy = 0;
        d = a*n-m*b;
        dx = c*n-k*b;
        dy = a*k-m*c;
        if(d != 0){
            x = dx/d;
            y = dy/d;
        }
        else if ((d == 0 && dx !=0) || (d == 0 && dy != 0)){
            return "Math Error";
        }
        else if ((d == 0 && dx ==0) || (d == 0 && dy == 0)){
            return "Math Error";
        }
        return "x = "+ x +", y = " + y + "";
    }
}
