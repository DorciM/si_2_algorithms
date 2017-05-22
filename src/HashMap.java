/**
 * Created by doramedgyasszay on 2017. 05. 02..
 */
public class HashMap {

    private static final int initialSize = 16;
    private Node table[] = new Node[initialSize];

    public int myHashCode(Object key){
        return Math.abs(key.hashCode() % initialSize);
    }
    public void put(Object key, String value){
        Node entry = new Node(key, value);
        int hashValue = myHashCode(key);

        if (table[hashValue] == null){ //alapeset, amikor nem foglalt még a bucket address
            table[hashValue] = entry;
        } else {
            Node current = table[hashValue];
            while (current.getNext() != null){ //végiglépked a bucket linked listjén
                if (current.getKey().equals(entry.getKey())){ //ha talál egyező key-t,kicseréli a value-t
                    current.setValue(entry.getValue());
                    return;
                }
                current = current.getNext();
            }
            current.setNext(entry); // current.getNext == null, vagyis nincs több Node a listben, ide teszi az entry-t
        }
    }

    public String get(Object key){
        int hashedKey = myHashCode(key);
        Node node = table[hashedKey]; //megkeresi a táblában az elhashelt key-t
        while (node != null){
            if (node.getKey().equals(key)){
                return node.getValue();
            }
            node = node.getNext();
        }
        return null; //nem talált egyező hash-t
    }

    public static void main(String[] args) {
        HashMap hMap = new HashMap();
        hMap.put(12, "Valami");
        hMap.put(300, "Megint");
        hMap.put(65, "Hiányzik");
        System.out.println(hMap.get(55));
    }
}
