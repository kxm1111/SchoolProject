import os
import shutil

def add_to_startup_folder():
    startup_dir = os.path.join(os.getenv('APPDATA'), r"Microsoft\Windows\Start Menu\Programs\Startup")
    exe_path = r"C:\Path\To\1.exe"
    
    try:
        # 创建快捷方式并复制到启动文件夹
        shortcut_path = os.path.join(startup_dir, "1.lnk")
        # 使用第三方库创建快捷方式（需安装pypiwin32）
        import win32com.client
        shell = win32com.client.Dispatch("WScript.Shell")
        shortcut = shell.CreateShortCut(shortcut_path)
        shortcut.Targetpath = exe_path
        shortcut.save()
        print("✅ 启动文件夹快捷方式创建成功！")
    except ImportError:
        # 备用方案：直接复制exe（会显示窗口）
        shutil.copy(exe_path, startup_dir)
        print("⚠️ 未安装win32com，已复制exe文件（可能弹窗）")