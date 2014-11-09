package org.docksidestage.mysql.dbflute.whitebox.resola;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.sql.DataSource;

import org.dbflute.cbean.result.ListResultBean;
import org.docksidestage.mysql.dbflute.cbean.MemberCB;
import org.docksidestage.mysql.dbflute.exbhv.MemberBhv;
import org.docksidestage.mysql.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.mysql.dbflute.exentity.Member;
import org.docksidestage.mysql.dbflute.resola.exbhv.ResolaStationBhv;
import org.docksidestage.mysql.dbflute.resola.exentity.ResolaStation;
import org.docksidestage.mysql.unit.UnitResolaContainerTestCase;

/**
 * @author jflute
 */
@SuppressWarnings("unused")
public class WxMultipleDBResolaMySQLTest extends UnitResolaContainerTestCase {

    private MemberBhv memberBhv;
    private PurchaseBhv purchaseBhv;
    private ResolaStationBhv resolaStationBhv;

    public void test_acceesible() throws Exception {
        checkAccessToMainSchema();
        ResolaStation registered = registerTestStation();
        checkAccessToMainSchema();
        ListResultBean<ResolaStation> stationList = resolaStationBhv.selectList(cb -> {
            cb.orScopeQuery(orCB -> {
                orCB.query().setBirthdate_GreaterEqual(toLocalDate("1970/01/01")); /* should be Date */
                orCB.query().setFormalizedDatetime_GreaterEqual(toLocalDateTime("1970/01/01"));
                orCB.query().setHomeCount_GreaterEqual(0);
            });
        });
        assertHasAnyElement(stationList);
        for (ResolaStation station : stationList) {
            log(station);
            if (station.getStationId().equals(registered.getStationId())) {
                markHere("exists");
            }
        }
        assertMarked("exists");

        DataSource dataSource = getDataSource();
        log(dataSource);
        assertNotNull(dataSource); // maihamadb (test of UTFlute)
    }

    protected ResolaStation registerTestStation() {
        LocalDate currentLocalDate = currentLocalDate();
        BigDecimal workingKilometer = new BigDecimal("7.8");
        ResolaStation station = new ResolaStation();
        station.setStationId(88888);
        station.setStationName("MultipleDB Test");
        station.setBirthdate(currentLocalDate);
        station.setFormalizedDatetime(currentLocalDateTime());
        station.setHomeCount(3);
        station.setWorkingKilometer(workingKilometer);
        resolaStationBhv.insert(station);

        resolaStationBhv.selectEntity(cb -> {
            cb.query().setBirthdate_Equal(currentLocalDate);
            cb.query().setStationId_Equal(88888);
        }).alwaysPresent(actual -> {
            assertEquals(3, actual.getHomeCount());
            assertEquals(workingKilometer.setScale(2), actual.getWorkingKilometer().setScale(2));
        });
        return station;
    }

    protected void checkAccessToMainSchema() {
        MemberCB cb = new MemberCB();
        ListResultBean<Member> memberList = memberBhv.selectList(cb);
        assertHasAnyElement(memberList);
    }

    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
}
