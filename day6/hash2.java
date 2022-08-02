class HashTable{

  private final int capacity=10;

  private int size=0;

  Integer[] bucket=new Integer[capacity];

  //hash generator
  int hash(Integer key){
    int idx=key % capacity;
    return idx;
  }

  boolean put(Integer value){
    int idx=hash(value);

    if(bucket[idx]==null){
      bucket[idx]=value;
      size++;
      System.out.println(">> Added key:" + value+ "On:"+idx);
      return true;
    }
    else{
      System.out.println(">> Occupied index:" + idx+ "for key: "+value);
      return false;
    }
  }
  void iterate(){

    for (Integer key: bucket){
      if(key != null){
        System.out.println(">> Data: " + key);
      }
    }
  }

  Integer get(Integer key){
    int idx=hash(key);

    return bucket[idx];
  }

  boolean contains (Integer value){
    int idx=hash(value);
    return (bucket[idx]!=null);
  }
  int size(){
    return size;
  }
  int capacity(){
    return capacity;
  }

  boolean remove (Integer key){
    int idx=hash(key);
    if(bucket[idx]!=null){
      bucket[idx]=null;
      size--;
      System.out.println(">>key "+ key+" removed from index"+idx);
      return true;
    }
    else{
      System.out.println(">>No key "+ key+" found from index"+idx);
      return false;
    }
  }
  
}

class HashTableApp{
  public static void main(String args[]){

    HashTable table=new HashTable();
    System.out.println(">> Capacity: "+table.capacity());
    System.out.println(">> Size: "+table.size());
//will store it in the random order
    table.put(450);
    table.put(50);
    table.put(4);
    table.put(7);
    table.put(9);
    table.put(1);
    table.put(11);
    table.put(150);
    table.put(40);
    table.put(98);

    System.out.println("");
    System.out.println(">> Capacity: "+table.capacity());
    System.out.println(">> Size: "+table.size());

    table.iterate();

    table.remove(450);
    table.remove(40);
    System.out.println("");
    System.out.println(">> Capacity: "+table.capacity());
    System.out.println(">> Size: "+table.size());

    table.iterate();
    
  }
}