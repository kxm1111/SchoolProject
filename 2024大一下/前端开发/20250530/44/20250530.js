const banner_c = document.querySelector(".banner-c");
const btnRight = document.querySelector(".lving-right button");
const btnLeft = document.querySelector(".lving-left button");
let index = 1; // 初始位置（从第1张真实图片开始）

// 右滑逻辑
btnRight.onclick = function () {
    if (index === 3) { // 到达最后一张真实图
        banner_c.style.transition = "none"; // 禁用过渡
        index = 1; // 瞬跳回第一张
        banner_c.style.marginLeft = "-25%"; // 重置位置
        setTimeout(() => {
            banner_c.style.transition = "margin-left 0.3s"; // 恢复过渡
            index++;
            banner_c.style.marginLeft = `calc(-${index * 50}% + 25%)`; // 正常滑动
        }, 100);
    } else {
        index++;
        banner_c.style.marginLeft = `calc(-${index * 50}% + 25%)`;
    }
};

// 左滑逻辑（原理同上，方向相反）
btnLeft.onclick = function () {
    if (index === 1) {
        banner_c.style.transition = "none";
        index = 3;
        banner_c.style.marginLeft = `calc(-${index * 50}% + 25%)`;
        setTimeout(() => {
            banner_c.style.transition = "margin-left 0.3s";
            index--;
            banner_c.style.marginLeft = `calc(-${index * 50}% + 25%)`;
        }, 100);
    } else {
        index--;
        banner_c.style.marginLeft = `calc(-${index * 50}% + 25%)`;
    }
};