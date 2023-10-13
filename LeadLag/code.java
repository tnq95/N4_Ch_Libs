public void onStart() throws Exception
{
  // start up code here
}

public void onExecute() throws Exception
{
  // execute code (set executeOnChange flag on inputs)

  BStatusBoolean out1 = getOut1();
  BStatusBoolean out2 = getOut2();
  BStatusBoolean out3 = getOut3();
  BStatusBoolean out4 = getOut4();
  double Sel = getIn();
  
  switch((int)Sel){
    case 0 : 
      out1.setValue(true);
      out2.setValue(false);
      out3.setValue(false);
      out4.setValue(false);
      break;
    case 1 : 
      out1.setValue(false);
      out2.setValue(true);
      out3.setValue(false);
      out4.setValue(false);
      break;
    case 2 : 
      out1.setValue(false);
      out2.setValue(false);
      out3.setValue(true);
      out4.setValue(false);
      break;
    case 3 : 
      out1.setValue(false);
      out2.setValue(false);
      out3.setValue(false);
      out4.setValue(true);
      break;
  }
}



public void onStop() throws Exception
{
  // shutdown code here
}

