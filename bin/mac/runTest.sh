#!/bin/sh
# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
# Universidad de los Andes (Bogotá - Colombia)
# Departamento de Ingeniería de Sistemas y Computación
# Licenciado bajo el esquema Academic Free License version 2.1
#
# Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
# Ejercicio: n1_alquilerCarros
# Autor: Kelvin Guerrero - 06-feb-2013
# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

stty -echo

# ---------------------------------------------------------
# Ejecución de las pruebas
# ---------------------------------------------------------

cd ../..
	
java -ea -classpath lib/alquilerCarros.jar:test/lib/junit.jar:test/lib/alquilerCarrosTest.jar junit.swingui.TestRunner uniandes.cupi2.alquilerCarros.test.AlquilerCarrosTest
	
java -ea -classpath lib/alquilerCarros.jar:test/lib/junit.jar:test/lib/alquilerCarrosTest.jar junit.swingui.TestRunner uniandes.cupi2.alquilerCarros.test.CarroTest
cd bin/mac

stty echo
