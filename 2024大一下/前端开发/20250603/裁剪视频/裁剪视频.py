from moviepy import VideoFileClip

print("加载视频")
video = VideoFileClip("1.mp4")
print("裁剪视频")
vs = video.subclipped(0, 10)
print("开始保存视频")
vs.write_videofile("0-10-2.mp4")
print("关闭文件")
video.close()
print("关闭文件")
vs.close()
print("结束")

