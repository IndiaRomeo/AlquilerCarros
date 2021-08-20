#!/bin/sh
# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
# Universidad de los Andes (Bogot� - Colombia)
# Departamento de Ingenier�a de Sistemas y Computaci�n
# Licenciado bajo el esquema Academic Free License version 2.1
#
# Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
# Ejercicio: n1_alquilerCarros
# Autor: Kelvin Guerrero - 06-feb-2013
# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

stty -echo

# ---------------------------------------------------------
# Asegura la creaci�n de los directorios classes y lib en test
# ---------------------------------------------------------

cd ../../test/
mkdir classes
mkdir lib

# ---------------------------------------------------------
# Compila las clases del directotio test/source
# ---------------------------------------------------------

cd source
javac -source 1.5 -classpath ../../lib/alquilerCarros.jar:../lib/junit.jar -d ../classes/ uniandes/cupi2/alquilerCarros/test/*.java

# ---------------------------------------------------------
# Crea el archivo jar a partir de los archivos compilados
# ---------------------------------------------------------

cd ../classes

jar cf ../lib/alquilerCarrosTest.jar uniandes/* -C ../data .

cd ../../bin/mac

stty echo