package com.ve.usercenter.core.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Service;

import com.ve.usercenter.core.dao.ConsigneeDao;
import com.ve.usercenter.core.domain.ConsigneeDO;

@Service
public class ConsigneeDaoImpl extends SqlMapClientDaoSupport implements
		ConsigneeDao {

	@Override
	public int getConsigneeCountByUserId(Long userId) {
		// TODO Auto-generated method stub
		int count = (Integer) getSqlMapClientTemplate().queryForObject(
				"user_consignee_info.selectCount", userId);
		return count;
	}

	@Override
	public Long addConsigee(ConsigneeDO consigneeDo) {
		// TODO Auto-generated method stub

		Long id = (Long) getSqlMapClientTemplate().insert(
				"user_consignee_info.insert", consigneeDo);

		return id;
	}

	@Override
	public ConsigneeDO getConsigneeById(Long userId, Long id) {

		ConsigneeDO key = new ConsigneeDO();
		key.setId(id);
		key.setUserId(userId);
		key = (ConsigneeDO) getSqlMapClientTemplate().queryForObject(
				"user_consignee_info.selectById", key);

		return key;
	}

	@Override
	public int deleteConsignee(Long userId, Long id) {
		ConsigneeDO key = new ConsigneeDO();
		key.setId(id);
		key.setUserId(userId);
		int result = getSqlMapClientTemplate().update(
				"user_consignee_info.deleteById", key);
		return result;
	}

	@Override
	public int updateConsigee(ConsigneeDO consigneeDo) {
		// TODO Auto-generated method stub
		int result = getSqlMapClientTemplate().update(
				"user_consignee_info.updateById", consigneeDo);
		return result;
	}

	@Override
	public int updateUserDefaultConsignee(Long userId) {
		// TODO Auto-generated method stub

		int result = getSqlMapClientTemplate().update(
				"user_consignee_info.updateDefaultConsignee", userId);
		return result;
	}

	@Override
	public int setDefConsignee(Long userId, Long id) {
		ConsigneeDO key = new ConsigneeDO();
		key.setId(id);
		key.setUserId(userId);
		int result = getSqlMapClientTemplate().update(
				"user_consignee_info.setDefConsignee", key);
		return result;
	}

	@Override
	public List<ConsigneeDO> queryConsignee(Long userId) {
		// TODO Auto-generated method stub

		List<ConsigneeDO> consigneeDos = getSqlMapClientTemplate()
				.queryForList("user_consignee_info.queryConsignee", userId);

		return consigneeDos;
	}

	@Override
	public int deleteUserConsignee(Long userId) {
		// TODO Auto-generated method stub
		int result = getSqlMapClientTemplate().update(
				"user_consignee_info.deleteByUserId", userId);
		return result;
	}

	@Override
	public int restoreUserConsignee(Long userId) {
		// TODO Auto-generated method stub
		int result = getSqlMapClientTemplate().update(
				"user_consignee_info.restoreByUserId", userId);
		return result;
	}
}
