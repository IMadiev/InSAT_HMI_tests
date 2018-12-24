net use X: \\10.0.0.100\Installations\_Last IMhchjgc876587 /USER:IMadiev
@echo off
echo set WshShell = WScript.CreateObject("WScript.Shell")>Tmp.vbs
echo set Lnk = WshShell.Createshortcut(WScript.Arguments(0))>>Tmp.vbs
echo WScript.Echo Lnk.TargetPath>>Tmp.vbs
for /f "delims=" %%d in ('cscript //nologo Tmp.vbs "X:\MPLCD_Beta.lnk"') do del Tmp.vbs & set installerPath=%%~d
echo Yes | xcopy %installerPath%
Reinstall.exe