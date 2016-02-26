{\rtf1\ansi\ansicpg1252\cocoartf1404\cocoasubrtf110
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.io.*;\
public class Main \{\
    public static void main (String[] args) throws IOException \{\
        File file = new File(args[0]);\
        BufferedReader buffer = new BufferedReader(new FileReader(file));\
        String line;\
        while ((line = buffer.readLine()) != null) \{\
            line = line.trim();\
            voltear(line);\
        \}\
    \}\
    \
    public static void voltear(String line) \{\
        String[]palabras = line.split(" ");\
        String output = "";\
        for(int i = palabras.length -1; i >= 0; i--) \{\
        output = output + palabras[i] + " ";\
        \}\
        System.out.println(output.trim());\
    \}\
\}}