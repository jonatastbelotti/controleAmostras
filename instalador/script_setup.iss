; Script generated by the Inno Setup Script Wizard.
; SEE THE DOCUMENTATION FOR DETAILS ON CREATING INNO SETUP SCRIPT FILES!

[Setup]
; NOTE: The value of AppId uniquely identifies this application.
; Do not use the same AppId value in installers for other applications.
; (To generate a new GUID, click Tools | Generate GUID inside the IDE.)
AppId={{DE95539F-5B8C-40E6-A1F2-9073072E4234}
AppName=Controle de Amostras
AppVersion=1.0.0
;AppVerName=Controle de Amostras 1.0.0
AppPublisher=Belotti, J�natas Trabuco
DefaultDirName={pf}\Controle de Amostras
DisableProgramGroupPage=yes
OutputDir=C:\Users\jonat\Desktop\controleAmostras\instalador
OutputBaseFilename=setup_controle_amostras
Compression=lzma
SolidCompression=yes

[Languages]
Name: "brazilianportuguese"; MessagesFile: "compiler:Languages\BrazilianPortuguese.isl"

[Tasks]
Name: "desktopicon"; Description: "{cm:CreateDesktopIcon}"; GroupDescription: "{cm:AdditionalIcons}"; Flags: unchecked
Name: "quicklaunchicon"; Description: "{cm:CreateQuickLaunchIcon}"; GroupDescription: "{cm:AdditionalIcons}"; Flags: unchecked; OnlyBelowVersion: 0,6.1

[Files]
Source: "C:\Users\jonat\Desktop\controleAmostras\Controle de Amostras.exe"; DestDir: "{app}"; Flags: ignoreversion
; NOTE: Don't use "Flags: ignoreversion" on any shared system files

[Icons]
Name: "{commonprograms}\Controle de Amostras"; Filename: "{app}\Controle de Amostras.exe"
Name: "{commondesktop}\Controle de Amostras"; Filename: "{app}\Controle de Amostras.exe"; Tasks: desktopicon
Name: "{userappdata}\Microsoft\Internet Explorer\Quick Launch\Controle de Amostras"; Filename: "{app}\Controle de Amostras.exe"; Tasks: quicklaunchicon

[Run]
Filename: "{app}\Controle de Amostras.exe"; Description: "{cm:LaunchProgram,Controle de Amostras}"; Flags: nowait postinstall skipifsilent runascurrentuser

