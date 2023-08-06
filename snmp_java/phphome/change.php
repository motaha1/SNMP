<?php

if(!empty($_POST["contact"])){
    snmp2_set("127.0.0.1","public",".1.3.6.1.2.1.1.4.0","s",$_POST['contact']);
    echo "change succseflly";
}
/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Scripting/EmptyPHP.php to edit this template
 */

