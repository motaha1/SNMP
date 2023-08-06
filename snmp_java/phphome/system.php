<?php

/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Scripting/EmptyPHP.php to edit this template
 */

  echo "System description -------> ";    
  echo snmp2_get("127.0.0.1", "public", "1.3.6.1.2.1.1.1.0")."\n";
  //echo snmp2_walk($ip,"public",".1.3.6.1.2.1.1.1.0");
  
  echo "Object ID -------> "; 
  echo snmp2_get("127.0.0.1", "public", ".1.3.6.1.2.1.1.2.0")."\n";
  echo "Up time	------->"; 
  echo snmp2_get("127.0.0.1", "public", ".1.3.6.1.2.1.1.3.0")."\n";
  echo "Contact	-------> "; 
  echo snmp2_get("127.0.0.1", "public", ".1.3.6.1.2.1.1.4.0")."\n";
  echo "Name ------->  "; 
  echo snmp2_get("127.0.0.1", "public", ".1.3.6.1.2.1.1.5.0")."\n";
  echo "Location------->  "; 
  echo snmp2_get("127.0.0.1", "public", ".1.3.6.1.2.1.1.6.0")."\n";


//$ip= "127.0.0.1";
//$sys_group= snmp2_walk($ip,"public",".1.3.6.1.2.1.1");
//foreach($sys_group as $val)
   // echo $val."\n";

