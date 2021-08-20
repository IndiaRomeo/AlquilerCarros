@echo off
REM ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
REM Universidad de los Andes (Bogotá - Colombia)
REM Departamento de Ingeniería de Sistemas y Computación 
REM Licenciado bajo el esquema Academic Free License version 2.1 
REM
REM Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
REM Ejercicio: n1_alquilerCarros
REM Autor: Kelvin Guerrero - 06-feb-2013
REM ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

SET CLASSPATH=

REM ---------------------------------------------------------
REM Ejecucion de las pruebas
REM ---------------------------------------------------------

cd ../..
	
java -ea -classpath lib/alquilerCarros.jar;test/lib/junit.jar;test/lib/alquilerCarrosTest.jar junit.swingui.TestRunner uniandes.cupi2.alquilerCarros.test.AlquilerCarrosTest
	
java -ea -classpath lib/alquilerCarros.jar;test/lib/junit.jar;test/lib/alquilerCarrosTest.jar junit.swingui.TestRunner uniandes.cupi2.alquilerCarros.test.CarroTest
cd bin/win