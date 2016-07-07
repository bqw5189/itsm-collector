package com.itsm.platform.collector.service;

import com.itsm.platform.common.model.CollectorInfo;
import com.itsm.platform.common.model.Parameter;

import javax.naming.Referenceable;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * 采集器工程接口
 */
public interface CollectorFactory extends Referenceable,
        Serializable {


    /**
     * 获取jca连接
     *
     * @return Collector 相应的连接对象
     */
    public Collector getConnection();


    /**
     * 返回指定采集器的定位信息的名称.
     *
     * @param prtcName 采集器名称
     * @return 相应的定位信息
     */
    public ArrayList<String> getIdentifyParameterNames(String prtcName);

    /**
     * 返回采集器支持的所有采集器信息对象.
     *
     * @return CollectorInfo[] 采集器信息对象
     */
    public CollectorInfo[] getAllCollectorInfos();

    /**
     * 返回该采集器支持的所有采集的名称，采集器名称是访问采集的唯一索引.
     *
     * @return 采集的名称
     */
    public String[] getAllCollectorNames();

    /**
     * 返回指定采集器的信息.
     *
     * @param prtcName 采集器名称
     * @return 采集器的信息
     */
    public CollectorInfo getCollectorInfo(String prtcName);


    /**
     * 返回指定采集器的参数信息
     *
     * @param prtcName 采集器名称
     * @return 参数信息
     */
    public Parameter[] getParameters(String prtcName);
}
