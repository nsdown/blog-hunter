package me.zhyd.hunter.config.platform;

import me.zhyd.hunter.config.HunterConfig;

/**
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2019/2/27 13:26
 * @since 1.8
 */
public interface InnerPlatform {

    HunterConfig process(String url);
}
