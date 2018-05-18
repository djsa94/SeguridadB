# SeguridadB
# Tarea Corta de Seguridad

Se crea una aplicacion que haga un ataque por escalacion de privilegios a otra aplicacion en android

## Inicio 
Clone la aplicacion en su IDE de Android Studio



### Prerequisitos

Android Studio
Android SDK 14 o 15

```

```

### Instalacion

Agregar Permisos de escritura de contacto en el manifest de la aplicacion A

```
<uses-permission  android:name = "android.permission.WRITE_CONTACTS "  />
```

Instalacion del SDK 15

```
Android studio -> Android SDK Manager -> Descargar Android 4.0.4 API 15
```

Configurar el proyecto actual a API 15

```
File -> Project structure -> app -> Flavours tab -> Targeted SDK version -> Elegir Android 4.0.4 API 15
```



## Correr la aplicacion
Se debe iniciar primero la aplicacion A, siguiente se inicia la aplicacion B (ambos en el mismo emulador)
En la aplicacion B se presiona el boton atacar y esto inicia el ataque. 
Se puede verificar en la lista de contactos los contactos agregados.





