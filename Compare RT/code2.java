public void onStart() throws Exception
{
  // start up code here
}

public void onExecute() throws Exception
{
  BStatusNumeric out1 = getOut1();
  BStatusNumeric out2 = getOut2();
  BStatusNumeric out3 = getOut3();
  BStatusNumeric out4 = getOut4();
  double Val1 = getIn1();
  double Val2 = getIn2();
  double Val3 = getIn3();
  double Val4 = getIn4();

  ArrayList<Double> args = new ArrayList<Double>();
  args.add(Val1+0.1);
  args.add(Val2+0.2);
  args.add(Val3+0.3);
  args.add(Val4+0.4);
  
  Collections.sort(args);
  
  int[] pos = searchElement(args);
  
  out1.setValue(pos[0]);
  out2.setValue(pos[1]);
  out3.setValue(pos[2]);
  out4.setValue(pos[3]); 
 
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

