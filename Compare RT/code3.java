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
  
  Collections.sort(listIn);
  int[] pos = searchElement(listIn);
  for(int i = 0; i < listOut.size(); i++){
    listOut.get(i).setValue(pos[i]);
  }
}

public int[] searchElement(ArrayList<Double> listInput){
  int[] arr = new int[listInput.size()];
  for(int i = 0; i < listInput.size(); i++) {
     if ((double)listInput.get(i) == (getIn1()+0.1))
      arr[0] = i;
     else if ((double)listInput.get(i) == (getIn2()+0.2))
      arr[1] = i;
     else if ((double)listInput.get(i) == (getIn3()+0.3))
      arr[2] = i;
     else if ((double)listInput.get(i) == (getIn4()+0.4))
      arr[3] = i;
      
  }
  return arr;
}

public void onStop() throws Exception
{
  // shutdown code here
}

