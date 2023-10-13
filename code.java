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

  float[] arr = {(float)(Val1 + 0.1),(float)(Val2+0.2),(float)(Val3+0.3),(float)(Val4+0.4)};
  float res[] = selectSort(arr);
  
  int pos1 = searchElement(res, (float)(Val1+0.1));	// 
  int pos2 = searchElement(res, (float)(Val2+0.2));
  int pos3 = searchElement(res, (float)(Val3+0.3));
  int pos4 = searchElement(res, (float)(Val4+0.4));
  
  if ((pos1 != -1 ) || (pos2 != -1 ) || (pos3 != -1 )|| (pos4 != -1 ) ){
      out1.setValue(pos1);
      out2.setValue(pos2);
      out3.setValue(pos3);
      out4.setValue(pos4);
  } 
}

public int searchElement(float[] arr, float x) {
    for(int i = 0; i < arr.length; i++) {
       if (arr[i] == x)
         return i;
    }
    return -1;
}

public float[] selectSort ( float [] array) {    
    int  position =  0 ;  
    for  ( int  i =  0 ; i <array.length; i ++) {  
        int  j = i +  1 ;  
        position = i;  
        float  temp = array [i];  
        for  (; j <array.length; j ++) {  
            if  (array [j] <temp) {  
                temp = array [j];  
                position = j;  
            }  
        }  
        array [position] = array [i];  
        array [i] = temp;  
    }  
    return array;
} 

public void onStop() throws Exception
{
  // shutdown code here
}

