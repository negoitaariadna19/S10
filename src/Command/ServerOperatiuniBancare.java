package Command;

import java.util.ArrayList;
import java.util.List;

public class ServerOperatiuniBancare {
    private List<OperatiuneBancara> listOperatiuni = new ArrayList<>();

    public void InregistreazaOperatiune(OperatiuneBancara operatiuneBancara) {
        listOperatiuni.add(operatiuneBancara);
    }

    public void efectueazaOperatiuniInregistrare() {
        for (int i = 0; i < listOperatiuni.size(); i++) {
            listOperatiuni.get(i).efectuareOperatiune();
        }
        listOperatiuni.clear();

        for (OperatiuneBancara ob : listOperatiuni) {
            listOperatiuni.remove(ob);
        }
    }

}
