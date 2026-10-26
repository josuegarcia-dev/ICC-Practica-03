public class Ejercicio12P3{
    public static String addBinary(String a,String b) {
        String mal="Hay un binario fuera de rango (1-10000)";
        int decimala=Integer.parseInt(a,2);
        int decimalb=Integer.parseInt(b,2);
        if(decimala>=16||decimala<0) return mal;
        if(decimalb>=16||decimalb<0) return mal;
        char[] na=new char[5];
        char[] nb=new char[5];
        char[] res=new char[5];
        String conca=a;
        String cero="0";
        while(conca.length()<5) conca=cero+conca;
        String concb=b;
        while(concb.length()<5) concb=cero+concb;
        for(int i=4;i>=0;i--) na[i]=conca.charAt(i);
        for(int j=4;j>=0;j--) nb[j]=concb.charAt(j);
        char acarreo='0';
        if(na[4]=='0'&&nb[4]=='0') {
            acarreo='0';
            res[4]='0';
        } else if(na[4]=='1'&&nb[4]=='1') {
            acarreo='1';
            res[4]='0';
        } else {
            acarreo='0';
            res[4]='1';
        }
        if(na[3]=='0'&&nb[3]=='0'&&acarreo=='0') {
            acarreo='0';
            res[3]='0';
        } else if(na[3]=='0'&&nb[3]=='0'&&acarreo=='1') {
            acarreo='0';
            res[3]='1';
        } else if(na[3]=='0'&&nb[3]=='1'&&acarreo=='0') {
            acarreo='0';
            res[3]='1';
        } else if(na[3]=='0'&&nb[3]=='1'&&acarreo=='1') {
            acarreo='1';
            res[3]='0';
        } else if(na[3]=='1'&&nb[3]=='0'&&acarreo=='0') {
            acarreo='0';
            res[3]='1';
        } else if(na[3]=='1'&&nb[3]=='0'&&acarreo=='1') {
            acarreo='1';
            res[3]='0';
        } else if(na[3]=='1'&&nb[3]=='1'&&acarreo=='0') {
            acarreo='1';
            res[3]='0';
        } else {
            acarreo='1';
            res[3]='1';
        }
        if(na[2]=='0'&&nb[2]=='0'&&acarreo=='0') {
            acarreo='0';
            res[2]='0';
        } else if(na[2]=='0'&&nb[2]=='0'&&acarreo=='1') {
            acarreo='0';
            res[2]='1';
        } else if(na[2]=='0'&&nb[2]=='1'&&acarreo=='0') {
            acarreo='0';
            res[2]='1';
        } else if(na[2]=='0'&&nb[2]=='1'&&acarreo=='1') {
            acarreo='1';
            res[2]='0';
        } else if(na[2]=='1'&&nb[2]=='0'&&acarreo=='0') {
            acarreo='0';
            res[2]='1';
        } else if(na[2]=='1'&&nb[2]=='0'&&acarreo=='1') {
            acarreo='1';
            res[2]='0';
        } else if(na[2]=='1'&&nb[2]=='1'&&acarreo=='0') {
            acarreo='1';
            res[2]='0';
        } else {
            acarreo='1';
            res[2]='1';
        }
        if(na[1]=='0'&&nb[1]=='0'&&acarreo=='0') {
            acarreo='0';
            res[1]='0';
        } else if(na[1]=='0'&&nb[1]=='0'&&acarreo=='1') {
            acarreo='0';
            res[1]='1';
        } else if(na[1]=='0'&&nb[1]=='1'&&acarreo=='0') {
            acarreo='0';
            res[1]='1';
        } else if(na[1]=='0'&&nb[1]=='1'&&acarreo=='1') {
            acarreo='1';
            res[1]='0';
        } else if(na[1]=='1'&&nb[1]=='0'&&acarreo=='0') {
            acarreo='0';
            res[1]='1';
        } else if(na[1]=='1'&&nb[1]=='0'&&acarreo=='1') {
            acarreo='1';
            res[1]='0';
        } else if(na[1]=='1'&&nb[1]=='1'&&acarreo=='0') {
            acarreo='1';
            res[1]='0';
        } else {
            acarreo='1';
            res[1]='1';
        }
        if(na[0]=='0'&&nb[0]=='0'&&acarreo=='0') {
            acarreo='0';
            res[0]='0';
        } else if(na[0]=='0'&&nb[0]=='0'&&acarreo=='1') {
            acarreo='0';
            res[0]='1';
        } else if(na[0]=='0'&&nb[0]=='1'&&acarreo=='0') {
            acarreo='0';
            res[0]='1';
        } else if(na[0]=='0'&&nb[0]=='1'&&acarreo=='1') {
            acarreo='1';
            res[0]='0';
        } else if(na[0]=='1'&&nb[0]=='0'&&acarreo=='0') {
            acarreo='0';
            res[0]='1';
        } else if(na[0]=='1'&&nb[0]=='0'&&acarreo=='1') {
            acarreo='1';
            res[0]='0';
        } else if(na[0]=='1'&&nb[0]=='1'&&acarreo=='0') {
            acarreo='1';
            res[0]='0';
        } else {
            acarreo='1';
            res[0]='1';
        }
        String resultado=new String(res);
        return resultado;
    }
}
