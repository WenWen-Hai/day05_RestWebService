package com.wen.service;

import com.sun.org.glassfish.external.probe.provider.annotations.Probe;
import com.wen.po.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;

public interface UserService {
    //查询
    @GET  //只响应get请求
    @Path("/get/{id}")//get后面的值是参数
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public User get(@PathParam("id") String id);

    //新增
    @POST
    @Path("/post/{id}")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public User post(@PathParam("id") String id,User user);

    //修改
    @PUT
    @Path("/put/{id}")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public User put(@PathParam("id") String id,User user);

    //删除
    @DELETE
    @Path("/delete/{id}")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public void delete(@PathParam("id")String id);
}
