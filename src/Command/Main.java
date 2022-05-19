package Command;

public class Main {
    public static void main(String[] args) {
        OperatiuneBancara op=new Plata(200.50,"ABC123");
        OperatiuneBancara op2=new Plata(300.70,"DEF234");
        OperatiuneBancara op3=new Plata(500.10,"alt cont");

        op.efectuareOperatiune();
        op2.efectuareOperatiune();
        ServerOperatiuniBancare server=new ServerOperatiuniBancare();
        server.InregistreazaOperatiune(op);
        server.InregistreazaOperatiune(op2);
        server.InregistreazaOperatiune(op3);
        server.efectueazaOperatiuniInregistrare();
    }
}
