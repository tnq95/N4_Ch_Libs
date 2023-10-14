public void onStart() throws Exception
{
  // start up code here
}

public void onExecute() throws Exception
{
  // execute code (set executeOnChange flag on inputs)

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
  
  int pos1 = searchElement(args, (double)(Val1+0.1));
  int pos2 = searchElement(args, (double)(Val2+0.2));
  int pos3 = searchElement(args, (double)(Val3+0.3));
  int pos4 = searchElement(args, (double)(Val4+0.4));
  
  if ((pos1 != -1 ) || (pos2 != -1 ) || (pos3 != -1 )|| (pos4 != -1 ) ){
      out1.setValue(pos1);
      out2.setValue(pos2);
      out3.setValue(pos3);
      out4.setValue(pos4);
  } 
}

public int searchElement(ArrayList<Double> arr, double x) {
    for(int i = 0; i < arr.size(); i++) {
       if ((double)arr.get(i) == x)
         return i;
    }
    return -1;
}


public void onStop() throws Exception
{
  // shutdown code here
}

