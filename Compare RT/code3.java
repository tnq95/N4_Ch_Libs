public void onStart() throws Exception
{
  // start up code here
}

public void onExecute() throws Exception
{
  double offset = 0.1;
  ArrayList<Double> listIn = new ArrayList<Double>();
  ArrayList<BStatusNumeric> listOut = new ArrayList<BStatusNumeric>();
    
  for (Property prop : this.getComponent().getPropertiesArray()){
     if(prop.getType().equals(BDouble.TYPE)){             // Input -> baja:Double 
         listIn.add(this.getDouble(prop) + offset);
         offset += 0.1;
     }
     else if(prop.getType().equals(BStatusNumeric.TYPE)){ // Output -> baja:BStatusNumeric
         listOut.add((BStatusNumeric)this.get(prop));
     }         
  }
  
  ArrayList<Double> newListIn = new ArrayList<Double>(listIn);
  Collections.sort(newListIn);

  int[] pos = searchElement(newListIn, listIn);
  for(int i = 0; i < listOut.size(); i++){
    listOut.get(i).setValue(pos[i]);
  }
    
}

public int[] searchElement(ArrayList<Double> listInput1, ArrayList<Double> listInput2){
  int[] arr = new int[listInput1.size()];
  for(int i = 0; i < listInput1.size(); i++) {
    arr[i] = listInput1.indexOf(listInput2.get(i));
  }
  return arr;
}


public void onStop() throws Exception
{
  // shutdown code here
}

