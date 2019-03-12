package com.techbridge.mvoucher.multitenancy;

import com.techbridge.mvoucher.domain.UserTenantRelation;
import com.techbridge.mvoucher.repository.UserTenantRelationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Alon Segal on 24/03/2017.
 */
@Component
public class TenantNameFetcher extends UnboundTenantTask<UserTenantRelation> {

    @Autowired
    private UserTenantRelationRepository userTenantRelationRepository;

    @Override
    protected UserTenantRelation callInternal() {
        UserTenantRelation utr = userTenantRelationRepository.findByUsername(this.username);
        return utr;
    }
}
