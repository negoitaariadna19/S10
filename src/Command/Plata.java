package Command;

public class Plata implements OperatiuneBancara{
   private Double suma;
   private String contDestinatie;

    public Plata(Double suma, String contDestinatie) {
        this.suma = suma;
        this.contDestinatie = contDestinatie;
    }


    @Override
    public void efectuareOperatiune() {

        System.out.println("S-a efectuat cu succes.Plata a fost efectuata pentru :" + contDestinatie);
    }
}
