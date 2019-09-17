package edu.hebeu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import edu.hebeu.entity.Attendance;
import edu.hebeu.entity.Employee;
import edu.hebeu.entity.Role;
import edu.hebeu.entity.UserPermis;
import edu.hebeu.mapper.RoleMapper;
import edu.hebeu.service.RoleService;



/**
 * @Title: 角色实现类
 * @author: Oldguo
 * @Desc:
 * @date: 2019年5月24日 下午3:47:10
 */
@Service("roleService")
public class RoleServiceImpl  extends ServiceImpl<RoleMapper, Role> implements RoleService{
	@Autowired
	private RoleMapper roleMapper;
	  @Override
	    public List<Role> selectRolesByUserCode(String userCode) {
		    List<Role>  list = roleMapper.selectRolesByUserCode(userCode);

			return list;
	    }
}
