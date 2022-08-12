package GenericType.ExtendsGeneric;

import java.util.ArrayList;
import java.util.Iterator;

public class Organisation<T extends Person> {
    private ArrayList<T> participants;

    public Organisation() {
        participants = new ArrayList<T>();
    }

    public void addParticipans(T p) {
        participants.add(p);

    }
    public T getParticipants(int index){
        return participants.get(index);
    }
    public void printParticipants(){
        Iterator <T> iterator = participants.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
