from DrissionPage import ChromiumPage
cp = ChromiumPage()
url = 'https://qq.com'
cp.listen.start('')
cp.get(url)
cp.listen.wait()
