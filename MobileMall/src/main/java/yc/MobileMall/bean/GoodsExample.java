package yc.MobileMall.bean;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public GoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table goods
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andDisPriceIsNull() {
            addCriterion("dis_price is null");
            return (Criteria) this;
        }

        public Criteria andDisPriceIsNotNull() {
            addCriterion("dis_price is not null");
            return (Criteria) this;
        }

        public Criteria andDisPriceEqualTo(Integer value) {
            addCriterion("dis_price =", value, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceNotEqualTo(Integer value) {
            addCriterion("dis_price <>", value, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceGreaterThan(Integer value) {
            addCriterion("dis_price >", value, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("dis_price >=", value, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceLessThan(Integer value) {
            addCriterion("dis_price <", value, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceLessThanOrEqualTo(Integer value) {
            addCriterion("dis_price <=", value, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceIn(List<Integer> values) {
            addCriterion("dis_price in", values, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceNotIn(List<Integer> values) {
            addCriterion("dis_price not in", values, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceBetween(Integer value1, Integer value2) {
            addCriterion("dis_price between", value1, value2, "disPrice");
            return (Criteria) this;
        }

        public Criteria andDisPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("dis_price not between", value1, value2, "disPrice");
            return (Criteria) this;
        }

        public Criteria andBrandsIsNull() {
            addCriterion("brands is null");
            return (Criteria) this;
        }

        public Criteria andBrandsIsNotNull() {
            addCriterion("brands is not null");
            return (Criteria) this;
        }

        public Criteria andBrandsEqualTo(String value) {
            addCriterion("brands =", value, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsNotEqualTo(String value) {
            addCriterion("brands <>", value, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsGreaterThan(String value) {
            addCriterion("brands >", value, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsGreaterThanOrEqualTo(String value) {
            addCriterion("brands >=", value, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsLessThan(String value) {
            addCriterion("brands <", value, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsLessThanOrEqualTo(String value) {
            addCriterion("brands <=", value, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsLike(String value) {
            addCriterion("brands like", value, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsNotLike(String value) {
            addCriterion("brands not like", value, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsIn(List<String> values) {
            addCriterion("brands in", values, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsNotIn(List<String> values) {
            addCriterion("brands not in", values, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsBetween(String value1, String value2) {
            addCriterion("brands between", value1, value2, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsNotBetween(String value1, String value2) {
            addCriterion("brands not between", value1, value2, "brands");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNull() {
            addCriterion("product_code is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("product_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(Integer value) {
            addCriterion("product_code =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(Integer value) {
            addCriterion("product_code <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(Integer value) {
            addCriterion("product_code >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_code >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(Integer value) {
            addCriterion("product_code <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(Integer value) {
            addCriterion("product_code <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<Integer> values) {
            addCriterion("product_code in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<Integer> values) {
            addCriterion("product_code not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(Integer value1, Integer value2) {
            addCriterion("product_code between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("product_code not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andRewardPointsIsNull() {
            addCriterion("reward_points is null");
            return (Criteria) this;
        }

        public Criteria andRewardPointsIsNotNull() {
            addCriterion("reward_points is not null");
            return (Criteria) this;
        }

        public Criteria andRewardPointsEqualTo(Integer value) {
            addCriterion("reward_points =", value, "rewardPoints");
            return (Criteria) this;
        }

        public Criteria andRewardPointsNotEqualTo(Integer value) {
            addCriterion("reward_points <>", value, "rewardPoints");
            return (Criteria) this;
        }

        public Criteria andRewardPointsGreaterThan(Integer value) {
            addCriterion("reward_points >", value, "rewardPoints");
            return (Criteria) this;
        }

        public Criteria andRewardPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("reward_points >=", value, "rewardPoints");
            return (Criteria) this;
        }

        public Criteria andRewardPointsLessThan(Integer value) {
            addCriterion("reward_points <", value, "rewardPoints");
            return (Criteria) this;
        }

        public Criteria andRewardPointsLessThanOrEqualTo(Integer value) {
            addCriterion("reward_points <=", value, "rewardPoints");
            return (Criteria) this;
        }

        public Criteria andRewardPointsIn(List<Integer> values) {
            addCriterion("reward_points in", values, "rewardPoints");
            return (Criteria) this;
        }

        public Criteria andRewardPointsNotIn(List<Integer> values) {
            addCriterion("reward_points not in", values, "rewardPoints");
            return (Criteria) this;
        }

        public Criteria andRewardPointsBetween(Integer value1, Integer value2) {
            addCriterion("reward_points between", value1, value2, "rewardPoints");
            return (Criteria) this;
        }

        public Criteria andRewardPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("reward_points not between", value1, value2, "rewardPoints");
            return (Criteria) this;
        }

        public Criteria andAvailabilityIsNull() {
            addCriterion("availability is null");
            return (Criteria) this;
        }

        public Criteria andAvailabilityIsNotNull() {
            addCriterion("availability is not null");
            return (Criteria) this;
        }

        public Criteria andAvailabilityEqualTo(Integer value) {
            addCriterion("availability =", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityNotEqualTo(Integer value) {
            addCriterion("availability <>", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityGreaterThan(Integer value) {
            addCriterion("availability >", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityGreaterThanOrEqualTo(Integer value) {
            addCriterion("availability >=", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityLessThan(Integer value) {
            addCriterion("availability <", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityLessThanOrEqualTo(Integer value) {
            addCriterion("availability <=", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityIn(List<Integer> values) {
            addCriterion("availability in", values, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityNotIn(List<Integer> values) {
            addCriterion("availability not in", values, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityBetween(Integer value1, Integer value2) {
            addCriterion("availability between", value1, value2, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityNotBetween(Integer value1, Integer value2) {
            addCriterion("availability not between", value1, value2, "availability");
            return (Criteria) this;
        }

        public Criteria andGoosdesIsNull() {
            addCriterion("goosdes is null");
            return (Criteria) this;
        }

        public Criteria andGoosdesIsNotNull() {
            addCriterion("goosdes is not null");
            return (Criteria) this;
        }

        public Criteria andGoosdesEqualTo(String value) {
            addCriterion("goosdes =", value, "goosdes");
            return (Criteria) this;
        }

        public Criteria andGoosdesNotEqualTo(String value) {
            addCriterion("goosdes <>", value, "goosdes");
            return (Criteria) this;
        }

        public Criteria andGoosdesGreaterThan(String value) {
            addCriterion("goosdes >", value, "goosdes");
            return (Criteria) this;
        }

        public Criteria andGoosdesGreaterThanOrEqualTo(String value) {
            addCriterion("goosdes >=", value, "goosdes");
            return (Criteria) this;
        }

        public Criteria andGoosdesLessThan(String value) {
            addCriterion("goosdes <", value, "goosdes");
            return (Criteria) this;
        }

        public Criteria andGoosdesLessThanOrEqualTo(String value) {
            addCriterion("goosdes <=", value, "goosdes");
            return (Criteria) this;
        }

        public Criteria andGoosdesLike(String value) {
            addCriterion("goosdes like", value, "goosdes");
            return (Criteria) this;
        }

        public Criteria andGoosdesNotLike(String value) {
            addCriterion("goosdes not like", value, "goosdes");
            return (Criteria) this;
        }

        public Criteria andGoosdesIn(List<String> values) {
            addCriterion("goosdes in", values, "goosdes");
            return (Criteria) this;
        }

        public Criteria andGoosdesNotIn(List<String> values) {
            addCriterion("goosdes not in", values, "goosdes");
            return (Criteria) this;
        }

        public Criteria andGoosdesBetween(String value1, String value2) {
            addCriterion("goosdes between", value1, value2, "goosdes");
            return (Criteria) this;
        }

        public Criteria andGoosdesNotBetween(String value1, String value2) {
            addCriterion("goosdes not between", value1, value2, "goosdes");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andReviewsIsNull() {
            addCriterion("reviews is null");
            return (Criteria) this;
        }

        public Criteria andReviewsIsNotNull() {
            addCriterion("reviews is not null");
            return (Criteria) this;
        }

        public Criteria andReviewsEqualTo(Integer value) {
            addCriterion("reviews =", value, "reviews");
            return (Criteria) this;
        }

        public Criteria andReviewsNotEqualTo(Integer value) {
            addCriterion("reviews <>", value, "reviews");
            return (Criteria) this;
        }

        public Criteria andReviewsGreaterThan(Integer value) {
            addCriterion("reviews >", value, "reviews");
            return (Criteria) this;
        }

        public Criteria andReviewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("reviews >=", value, "reviews");
            return (Criteria) this;
        }

        public Criteria andReviewsLessThan(Integer value) {
            addCriterion("reviews <", value, "reviews");
            return (Criteria) this;
        }

        public Criteria andReviewsLessThanOrEqualTo(Integer value) {
            addCriterion("reviews <=", value, "reviews");
            return (Criteria) this;
        }

        public Criteria andReviewsIn(List<Integer> values) {
            addCriterion("reviews in", values, "reviews");
            return (Criteria) this;
        }

        public Criteria andReviewsNotIn(List<Integer> values) {
            addCriterion("reviews not in", values, "reviews");
            return (Criteria) this;
        }

        public Criteria andReviewsBetween(Integer value1, Integer value2) {
            addCriterion("reviews between", value1, value2, "reviews");
            return (Criteria) this;
        }

        public Criteria andReviewsNotBetween(Integer value1, Integer value2) {
            addCriterion("reviews not between", value1, value2, "reviews");
            return (Criteria) this;
        }

        public Criteria andSalesnumIdIsNull() {
            addCriterion("salesnum_id is null");
            return (Criteria) this;
        }

        public Criteria andSalesnumIdIsNotNull() {
            addCriterion("salesnum_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalesnumIdEqualTo(Integer value) {
            addCriterion("salesnum_id =", value, "salesnumId");
            return (Criteria) this;
        }

        public Criteria andSalesnumIdNotEqualTo(Integer value) {
            addCriterion("salesnum_id <>", value, "salesnumId");
            return (Criteria) this;
        }

        public Criteria andSalesnumIdGreaterThan(Integer value) {
            addCriterion("salesnum_id >", value, "salesnumId");
            return (Criteria) this;
        }

        public Criteria andSalesnumIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("salesnum_id >=", value, "salesnumId");
            return (Criteria) this;
        }

        public Criteria andSalesnumIdLessThan(Integer value) {
            addCriterion("salesnum_id <", value, "salesnumId");
            return (Criteria) this;
        }

        public Criteria andSalesnumIdLessThanOrEqualTo(Integer value) {
            addCriterion("salesnum_id <=", value, "salesnumId");
            return (Criteria) this;
        }

        public Criteria andSalesnumIdIn(List<Integer> values) {
            addCriterion("salesnum_id in", values, "salesnumId");
            return (Criteria) this;
        }

        public Criteria andSalesnumIdNotIn(List<Integer> values) {
            addCriterion("salesnum_id not in", values, "salesnumId");
            return (Criteria) this;
        }

        public Criteria andSalesnumIdBetween(Integer value1, Integer value2) {
            addCriterion("salesnum_id between", value1, value2, "salesnumId");
            return (Criteria) this;
        }

        public Criteria andSalesnumIdNotBetween(Integer value1, Integer value2) {
            addCriterion("salesnum_id not between", value1, value2, "salesnumId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table goods
     *
     * @mbg.generated do_not_delete_during_merge Wed May 15 21:50:59 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table goods
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}