# from selenium import webdriver
# from selenium.webdriver.common.keys import Keys
#
# # 创建 Chrome WebDriver 实例
# # driver = webdriver.Chrome()
# driver = webdriver.Edge()
# # 打开百度首页
# driver.get("https://www.baidu.com")
#
# # 查找搜索框元素
# search_box = driver.find_element_by_name("wd")
#
# # 在搜索框中输入 "Runoob"
# search_box.send_keys("Runoob")
#
# # 模拟按下回车键
# search_box.send_keys(Keys.RETURN)
#
# # 关闭浏览器
# driver.quit()


# pip install webdriver-manager


# 下载驱动
# from selenium import webdriver
# from selenium.webdriver.edge.service import Service
# from webdriver_manager.microsoft import EdgeChromiumDriverManager
#
# # 自动安装并使用匹配的驱动
# service = Service(EdgeChromiumDriverManager().install())
# driver = webdriver.Edge(service=service)

# 可用
# from selenium import webdriver
# from selenium.webdriver.common.by import By
# from selenium.webdriver.edge.service import Service
# from webdriver_manager.microsoft import EdgeChromiumDriverManager
#
# # 自动安装并使用匹配的驱动
# service = Service(EdgeChromiumDriverManager().install())
# driver = webdriver.Edge(service=service)
#
# # try:
#     # 打开百度
# driver.get("https://www.baidu.com")
#
# # 使用新语法查找元素
# search_box = driver.find_element(By.NAME, "wd")
# search_box.send_keys("Selenium")
# search_box.submit()

# except Exception as e:
#     print(f"Error: {e}")
# finally:
    # driver.quit()  # 确保关闭浏览器


# pip install selenium

# 下载谷歌浏览器驱动
# from selenium import webdriver
# from selenium.webdriver.chrome.service import Service
# from webdriver_manager.chrome import ChromeDriverManager
#
# driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))
#



# from selenium import webdriver
# from selenium.webdriver import ActionChains
# from selenium.webdriver.edge.service import Service
# from webdriver_manager.microsoft import EdgeChromiumDriverManager
# from selenium.webdriver.common.by import By
#
#
#
# # from selenium import webdriver
# # from selenium.webdriver.chrome.service import Service as ChromeService
#
# # 设置正确的驱动路径
# service = Service(EdgeChromiumDriverManager().install())
# driver = webdriver.Edge(service=service)
#
#
# # 打开一个网站
# driver.get("https://www.baidu.com")
#
# # 获取页面标题
# print(driver.title)
#
# # 改为使用新的定位方法
# element = driver.find_element(By.CLASS_NAME, "title-content-title").text  # 注意text是属性，不是方法
# print(element)
# actions = ActionChains(driver)
# element1 = driver.find_element(By.ID, "kw")
# # 点击操作
# actions.click(element1).perform()

# 关闭浏览器
# driver.quit()


from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.edge.service import Service
from webdriver_manager.microsoft import EdgeChromiumDriverManager
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time

# 设置正确的驱动路径
service = Service(EdgeChromiumDriverManager().install())
driver = webdriver.Edge(service=service)

try:
    # 打开百度网站
    driver.get("https://www.baidu.com")
    print(f"打开网站: {driver.title}")

    # 使用显式等待确保元素加载完成
    wait = WebDriverWait(driver, 10)
    search_box = wait.until(
        EC.presence_of_element_located((By.ID, "kw"))
    )

    # 使用ActionChains执行复杂操作
    actions = ActionChains(driver)
    actions.click(search_box).send_keys("Python自动化测试").perform()

    # 定位搜索按钮并点击
    search_button = wait.until(
        EC.element_to_be_clickable((By.ID, "su"))
    )
    search_button.click()

    # 等待搜索结果页面加载
    wait.until(
        EC.title_contains("Python自动化测试")
    )
    print(f"搜索结果页面标题: {driver.title}")

    # 保持浏览器打开
    input("按回车键退出...")

except Exception as e:
    print(f"发生异常: {e}")

finally:
    # 可以选择在用户确认后关闭浏览器
    # driver.quit()
    pass




