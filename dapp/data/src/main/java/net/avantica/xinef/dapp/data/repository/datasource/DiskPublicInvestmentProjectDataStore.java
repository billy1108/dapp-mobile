package net.avantica.xinef.dapp.data.repository.datasource;

import net.avantica.xinef.dapp.data.cache.PublicInvestmentProjectCache;
import net.avantica.xinef.dapp.data.entity.PublicInvestmentProjectEntity;
import net.avantica.xinef.dapp.domain.entity.PublicInvestmentProject;

import java.util.List;

import rx.Observable;

/**
 * {@link PublicInvestmentProjectDataStore} implementation based on file system data store.
 */
public class DiskPublicInvestmentProjectDataStore implements PublicInvestmentProjectDataStore {

    private final PublicInvestmentProjectCache publicInvestmentProjectCache;

    /**
     * Construct a {@link PublicInvestmentProjectDataStore} based file system data store.
     *
     * @param publicInvestmentProjectCache A {@link PublicInvestmentProject} to cache data retrieved from the api.
     */
    public DiskPublicInvestmentProjectDataStore(PublicInvestmentProjectCache publicInvestmentProjectCache) {
        this.publicInvestmentProjectCache = publicInvestmentProjectCache;
    }

    @Override
    public Observable<List<PublicInvestmentProjectEntity>> publicInvestmentProjectEntityList() {
        return null;
    }

    @Override
    public Observable<PublicInvestmentProjectEntity> publicInvestmentProjectEntityDetails(String uniqueCode) {
        return this.publicInvestmentProjectCache.get(uniqueCode);
    }
}